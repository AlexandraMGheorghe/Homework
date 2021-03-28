package Curs19;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ComplexReflection {
    public void list() {
        Class vehicle = Vehicle.class;
        Method[] methods = vehicle.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }


    public static Object invocareMetodaPrinReflection(Object obj, String numeMetoda,
                                                      Object... setDeParametri) {
        int numarParametri = setDeParametri.length;
        Method metodaApelata;
        Object valoareReturn = null;
        Class<?>[] tipurileParametrilor = new Class<?>[numarParametri];
        for (int i = 0; i < numarParametri; i++) {
            tipurileParametrilor[i] = setDeParametri[i].getClass();
        }
        try {
            metodaApelata = obj.getClass().getDeclaredMethod(
                    numeMetoda, tipurileParametrilor);
            metodaApelata.setAccessible(true);
            valoareReturn = metodaApelata.invoke(obj, setDeParametri);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return valoareReturn;
    }



    public static void main(String[] args) {
        new ComplexReflection().list();

        System.out.println();

        Vehicle vehicle = new Vehicle();
        Method primaMetoda = Vehicle.class.getDeclaredMethods()[0];
        System.out.println(invocareMetodaPrinReflection(vehicle,
                primaMetoda.getName(), (Object[]) primaMetoda.getParameters()));

        System.out.println();

        Method aDouaMetoda = Vehicle.class.getDeclaredMethods()[1];
        System.out.println(invocareMetodaPrinReflection(vehicle,
                aDouaMetoda.getName(), (Object[]) aDouaMetoda.getParameters()));

    }


}

