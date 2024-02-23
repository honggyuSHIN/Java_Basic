package class01;

public class Practice {
    public static void main(String[] args) {
        School school01=new School();
        School school02=new School();

        school01.person=3;
        school01.desk=3;
        school01.chair=3;

        school02.person=4;
        school02.desk=4;
        school02.chair=4;

        School[] schools=new School[2];
        schools[0]=school01;
        schools[1]=school02;

        for (int i = 0; i < schools.length; i++) {
            System.out.println(schools[i].person);
            System.out.println(schools[i].chair);
            System.out.println(schools[i].desk);
        }
    }

}
