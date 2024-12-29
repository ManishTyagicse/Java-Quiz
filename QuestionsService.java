import java.util.Scanner;

public class QuestionsService{
    Question questions[] = new Question[5];

    String selections[] = new String[5];

    public QuestionsService(){
        questions[0] = new Question(1, "What are you learning", "C++", "Java", "C#", "Python", "Java");
        questions[1] = new Question(2, "What are you learning", "C++", "Java", "C#", "Python", "Java");
        questions[2] = new Question(3, "What are you learning", "C++", "Java", "C#", "Python", "Java");
        questions[3] = new Question(4, "What are you learning", "C++", "Java", "C#", "Python", "Java");
        questions[4] = new Question(5, "What are you learning", "C++", "Java", "C#", "Python", "Java");
    }

    public void playQuiz(){
        int i=0;
        for(Question q : questions){
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selections[i] = sc.nextLine();
            i++;
        }

        System.out.println("***************************************/");
        System.out.println("Your answers are : \n");
        for(String s : selections){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question ques = questions[i];

            String actualAnswer = ques.getAnswer();
            String userAnswer = selections[i];

            if(actualAnswer.equals(userAnswer))
                score++;
        }

        System.out.println("Your final score is : " + score);
    }
}