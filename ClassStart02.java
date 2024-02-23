package class01;

public class ClassStart02 {
    public static void main(String[] args) {
        String[] names = {"학생01", "학생02"};
        int[] ages = {15, 16};
        int[] grades = {90, 80};

        for (int i = 0; i < names.length; i++) {
            System.out.println("이름 : "+names[i]+"나이 : "+ages[i]+"성적 : "
                    +grades[i]);
        }




    }
}
