package pl.astrojewska.example.groovy.bug;

public class AppRunner {

    public static void main(String[] args) {

        BaseSpecializedRepo javaRepo = new InMemorySpecializedJavaRepo();
        System.out.println("\n### JAVA ###");
        javaRepo.call(new Integer(0));
        javaRepo.call(new String("empty"));

        BaseSpecializedRepo groovyRepo = new InMemorySpecializedGroovyRepo();
        System.out.println("\n### GROOVY ###");
        groovyRepo.call(new Integer(0));
        groovyRepo.call(new String("empty"));
    }


}
