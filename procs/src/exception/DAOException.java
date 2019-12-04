package exception;

public class DAOException extends Exception {
    private String messageBundleName = null;

    public DAOException(String message, String messageBundleName) {
        super(message);
        this.messageBundleName = messageBundleName;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public String getMessageBundleName() {
        return this.messageBundleName;
    }

    public void setMessageBundleName(String messageBundleName) {
        this.messageBundleName = messageBundleName;
    }
}