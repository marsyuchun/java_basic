package day08_file.fileMethod;

/**
 * Created by yanyuchun on 2020/4/25
 */
public class NoPathDeleteException extends Exception{
    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public NoPathDeleteException(String message) {
        super(message);
    }
}
