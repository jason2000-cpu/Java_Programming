
import java.lang.annotation.*;
import java.lang.reflect.*;

// Define the custom annotation
@Retention(RetentionPolicy.RUNTIME)    //Keep at runtime so you cna read it
@Target(ElementType.METHOD) // can be used on methods
@interface MyAnnotation {

    String value();

    int count() default 1;
}

// using the custom annotation on a method
class CustomAnn {

    @MyAnnotation(value = "Hello", count = 5)
    public void sayHello() {
        System.out.println("Say Hello");
    }
}

//Reading the annotation using reflection
public class Demo {

    public static void main(String a[]) throws Exception {
        CustomAnn b = new CustomAnn();

        //Get the method object
        Method method = b.getClass().getMethod("sayHello");

        // check if annotation is present
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnn = method.getAnnotation(MyAnnotation.class);

            System.out.println("Value: " + myAnn.value());
            System.out.println("Count: " + myAnn.count());

            System.out.println("\n");

            // Use  the elements to control behaviour
            for (int i = 0; i < myAnn.count(); i++) {
                b.sayHello();
            }
        }
    }
}
