package work_test.jira_handler;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yanyuchun on 2020/5/27
 */
public class JiraHandler {
    public static void main(String[] args) throws IOException {
        String path= "java_advance/src/work_test/jira_handler/all.txt";
        String target= "java_advance/src/work_test/jira_handler/all_jira.txt";

//        formatJira(path,target);

        replaceJira(target);



    }

    private static void replaceJira(String target) throws IOException {
        FileReader fr = new FileReader(target);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(target,true);
        BufferedWriter bw = new BufferedWriter(fw);


        for (int i = 0; i <5 ; i++) {
            bw.newLine();
        }
        String result="";
        String line ;
        while ((line = br.readLine())!=null){
            result= line+","+result;
        }

        bw.write(result);
        br.close();
        bw.close();
//        System.out.println(result);
        System.out.println("replace success");

    }

    private static void formatJira(String path, String target) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter(target,true);
        BufferedWriter bw = new BufferedWriter(fw);

        Set<String> set = new HashSet<>();
        String line ;
        while ((line = br.readLine())!=null){
            String substring = line.substring(0, 10);
            set.add(substring);
        }

        for (String s : set) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        fw.close();
        System.out.println("format success");

    }


}
