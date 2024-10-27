package Exception.src;

public class Case5Catch {
    public static void main(String[] args) {
            try {
                System.out.println(10 / 0);
            }
            catch (ArithmeticException e) {

                System.out.println(e.getMessage());

            }
            finally {

                System.out.println("Allahu akbar");
            }
        }
    }
