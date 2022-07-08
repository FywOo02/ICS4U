package Study.Assignment2B;

/**
 * @Author: Cho
 * @Date: 2022/04/24/14:37
 * @Description:
 */
public class Employee {
    private String id_no;
    private String name;
    private String postition;

    // basic constructor for init the data
    public Employee(String id_no, String name, String postition) {
        this.id_no = id_no;
        this.name = name;
        this.postition = postition;
    }
    // original calculatePay method
    public void calculatePay(){
    }
    // few get method and set method
    public String getId_no() {
        return id_no;
    }

    public void setId_no(String id_no) {
        this.id_no = id_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostition() {
        return postition;
    }

    public void setPostition(String postition) {
        this.postition = postition;
    }
}
