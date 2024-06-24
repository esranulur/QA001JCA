package day30_exception;

public class C02exception {
    public static void main(String[] args) {

        int a = 12;
        int b = 4;
        int c[] = {3, 5, 7, 9, 11};
        getir(c, a, b);
    }

    private static void getir(int[] c, int a, int b) {




            try {int idx = a / b;//arithmeticExc.

                int element = c[idx];//ArrayIndexOutOfException
                System.out.println(element);
            } catch (ArithmeticException e) {
                System.err.println("ArithmeticException " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("ArrayIndexOutOfBoundsException:  " + e.getMessage());
            }finally {//degerlerde sorun yokken calisir//degerlerde sorun varken calisir
                //exception firlatilsa bile calisir
                System.out.println("Bu finally yapisi nedir ?");
            }
        }

    }
