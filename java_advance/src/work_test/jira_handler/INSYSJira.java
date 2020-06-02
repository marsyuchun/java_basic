package work_test.jira_handler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanyuchun on 2020/5/12
 */
public class INSYSJira {
    public static void main(String[] args) throws IOException {
        String chongxiao = "INSYS-2999\n" +
                "INSYS-3011\n" +
                "INSYS-2993\n" +
                "INSYS-3021\n" +
                "INSYS-3034\n" +
                "INSYS-3037\n" +
                "INSYS-3038\n" +
                "INSYS-3014\n" +
                "INSYS-3040\n" +
                "INSYS-3018\n" +
                "INSYS-3053\n" +
                "INSYS-2951\n" +
                "INSYS-3043\n" +
                "INSYS-3060\n" +
                "INSYS-3013\n" +
                "INSYS-3068\n" +
                "INSYS-3059\n" +
                "INSYS-3069\n" +
                "INSYS-3091\n" +
                "INSYS-3082\n" +
                "INSYS-3092\n" +
                "INSYS-3096\n" +
                "INSYS-3101\n" +
                "INSYS-2895\n" +
                "INSYS-2991\n" +
                "INSYS-3103\n" +
                "INSYS-3110\n" +
                "INSYS-3114\n" +
                "INSYS-3116\n" +
                "INSYS-1703\n" +
                "INSYS-3121\n" +
                "INSYS-3130\n" +
                "INSYS-3122\n" +
                "INSYS-3119\n" +
                "INSYS-3075\n" +
                "INSYS-3033\n" +
                "INSYS-3146\n" +
                "INSYS-3150\n" +
                "INSYS-3133\n" +
                "INSYS-3148\n" +
                "INSYS-3157\n" +
                "INSYS-3174\n" +
                "INSYS-3170\n" +
                "INSYS-3185\n" +
                "INSYS-3171\n" +
                "INSYS-3187\n" +
                "INSYS-2984\n" +
                "INSYS-3179\n" +
                "INSYS-3180\n" +
                "INSYS-3199\n" +
                "INSYS-3194\n" +
                "INSYS-3204\n" +
                "INSYS-3106\n" +
                "INSYS-3186\n" +
                "INSYS-3197\n" +
                "INSYS-3191\n" +
                "INSYS-3213\n" +
                "INSYS-3217";
        String jiras = "INSYS-1703\n" +
                "INSYS-2066\n" +
                "INSYS-2298\n" +
                "INSYS-2585\n" +
                "INSYS-2590\n" +
                "INSYS-2650\n" +
                "INSYS-2820\n" +
                "INSYS-2822\n" +
                "INSYS-2895\n" +
                "INSYS-2903\n" +
                "INSYS-2918\n" +
                "INSYS-2951\n" +
                "INSYS-2984\n" +
                "INSYS-2985\n" +
                "INSYS-2991\n" +
                "INSYS-2993\n" +
                "INSYS-2999\n" +
                "INSYS-3006\n" +
                "INSYS-3011\n" +
                "INSYS-3013\n" +
                "INSYS-3014\n" +
                "INSYS-3018\n" +
                "INSYS-3021\n" +
                "INSYS-3033\n" +
                "INSYS-3034\n" +
                "INSYS-3037\n" +
                "INSYS-3038\n" +
                "INSYS-3040\n" +
                "INSYS-3041\n" +
                "INSYS-3043\n" +
                "INSYS-3053\n" +
                "INSYS-3058\n" +
                "INSYS-3059\n" +
                "INSYS-3060\n" +
                "INSYS-3061\n" +
                "INSYS-3065\n" +
                "INSYS-3067\n" +
                "INSYS-3068\n" +
                "INSYS-3069\n" +
                "INSYS-3072\n" +
                "INSYS-3074\n" +
                "INSYS-3075\n" +
                "INSYS-3076\n" +
                "INSYS-3080\n" +
                "INSYS-3081\n" +
                "INSYS-3082\n" +
                "INSYS-3086\n" +
                "INSYS-3089\n" +
                "INSYS-3091\n" +
                "INSYS-3092\n" +
                "INSYS-3096\n" +
                "INSYS-3097\n" +
                "INSYS-3098\n" +
                "INSYS-3099\n" +
                "INSYS-3101\n" +
                "INSYS-3103\n" +
                "INSYS-3106\n" +
                "INSYS-3109\n" +
                "INSYS-3110\n" +
                "INSYS-3114\n" +
                "INSYS-3116\n" +
                "INSYS-3119\n" +
                "INSYS-3121\n" +
                "INSYS-3122\n" +
                "INSYS-3123\n" +
                "INSYS-3130\n" +
                "INSYS-3132\n" +
                "INSYS-3133\n" +
                "INSYS-3136\n" +
                "INSYS-3137\n" +
                "INSYS-3144\n" +
                "INSYS-3146\n" +
                "INSYS-3147\n" +
                "INSYS-3148\n" +
                "INSYS-3150\n" +
                "INSYS-3154\n" +
                "INSYS-3156\n" +
                "INSYS-3157\n" +
                "INSYS-3164\n" +
                "INSYS-3165\n" +
                "INSYS-3169\n" +
                "INSYS-3170\n" +
                "INSYS-3171\n" +
                "INSYS-3174\n" +
                "INSYS-3176\n" +
                "INSYS-3177\n" +
                "INSYS-3178\n" +
                "INSYS-3179\n" +
                "INSYS-3180\n" +
                "INSYS-3184\n" +
                "INSYS-3185\n" +
                "INSYS-3186\n" +
                "INSYS-3187\n" +
                "INSYS-3188\n" +
                "INSYS-3191\n" +
                "INSYS-3194\n" +
                "INSYS-3196\n" +
                "INSYS-3197\n" +
                "INSYS-3199\n" +
                "INSYS-3202\n" +
                "INSYS-3203\n" +
                "INSYS-3204\n" +
                "INSYS-3206\n" +
                "INSYS-3207\n" +
                "INSYS-3208\n" +
                "INSYS-3213\n" +
                "INSYS-3215\n" +
                "INSYS-3217";
        String[] ins = jiras.split("\n");
        String[] target = chongxiao.split("\n");
        List<String> jiraList = new ArrayList<>();
        List<String> chongxiaoList = new ArrayList<>();
        for (String in : target) {
            chongxiaoList.add(in);
        }

        for (String in : ins) {
            jiraList.add(in);
        }
        System.out.println(jiraList.size());

        for (String s : chongxiaoList) {
            if (jiraList.contains(s)) {
                jiraList.remove(s);
            }
        }
//        for (String s : jiraList) {
//            if (chongxiaoList.contains(s)){
//                chongxiaoList.remove(s);
//            }
//        }
        System.out.println(jiraList.size());
        System.out.println(jiraList);
//        System.out.println(chongxiaoList.size());
        String targetPath = "work_test/jira_handler/notinchongxiao.txt";
        outputString(jiraList, targetPath);
    }


    public static void outputString(List<String> list, String path) throws IOException {
        FileWriter fw = new FileWriter(path, true);
        for (String s : list) {
            fw.write(s);
            fw.write("\n");
        }
        fw.close();
    }
}
