import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        try {
            //Obtenemos la clase
            Class<?> clase = Persona.class;
            // Nombre de la clase
            System.out.println("Nombre clase: " + clase.getName());
            // Clases e interfaces que implementa/hereda
            System.out.println("Clases padre: " + clase.getSuperclass());
            // Obtener los campos y constructores.
            // Obtener todos los constructores
            Constructor<?>[] constructores = clase.getConstructors();
            for (Constructor<?> c : constructores) {
                System.out.println("Constructor: " + c);
            }
            // Crear instancia usando constructor
            Constructor<Persona> constructor = Persona.class.getConstructor(String.class, int.class);
            Persona p = constructor.newInstance("Giuliano", 25);
            System.out.println(p.saludar()); // Hola
            // Obtener todos los métodos públicos
            Method[] metodos = clase.getMethods();
            for (Method m : metodos) {
                System.out.println("Método: " + m.getName());
            }

            // Invocar método saludar()
            Method saludar = clase.getMethod("saludar");
            String saludo = (String) saludar.invoke(p);
            System.out.println(saludo); // Hola

            // Obtener campos privados
            Field nombreField = clase.getDeclaredField("nombre");
            Field edadField = clase.getDeclaredField("edad");

            // Hacerlos accesibles
            nombreField.setAccessible(true);
            edadField.setAccessible(true);

            // Obtener valores actuales
            System.out.println("Nombre: " + nombreField.get(p));
            System.out.println("Edad: " + edadField.get(p));

            // Modificar valores
            nombreField.set(p, "Carlos");
            edadField.set(p, 30);

            System.out.println("Nuevo nombre: " + nombreField.get(p));
            System.out.println("Nueva edad: " + edadField.get(p));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
