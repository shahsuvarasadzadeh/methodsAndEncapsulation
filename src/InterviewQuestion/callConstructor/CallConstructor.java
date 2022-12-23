package InterviewQuestion.callConstructor;

public class CallConstructor {
    private int a=5;
    private int b=5;

    public CallConstructor(int a,int b){
        this(a);
    }

    public CallConstructor(int a) {
        this.a = a;
    }

}
