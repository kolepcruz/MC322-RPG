package utils;

public interface SkillsUtil {
    int power1();
    int power2();
    int power3();
    int power4();

    default void soDizQueTem(){
        System.out.println("RPG é legal");
    }
}
