public class NullPointerExceptionDemo {
    public static void generateException() {
        System.out.println("Generating NullPointerException without handling...");
        String text = null;
        System.out.println("Length of text: " + text.length());
    }
    public static void handleException() {
        System.out.println("Handling NullPointerException with try-catch...");
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Text is null.");
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleException();
    }
}
