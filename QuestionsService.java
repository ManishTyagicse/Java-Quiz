public class QuestionsService{
    Question questions[] = new Question[5];

    public QuestionsService(){
        questions[0] = new Question(1, "What are you learning", "C++", "Java", "C#", "Python", "Java");
        questions[1] = new Question(2, "What are you learning", "C++", "Java", "C#", "Python", "Java");
        questions[2] = new Question(3, "What are you learning", "C++", "Java", "C#", "Python", "Java");
        questions[3] = new Question(4, "What are you learning", "C++", "Java", "C#", "Python", "Java");
        questions[4] = new Question(5, "What are you learning", "C++", "Java", "C#", "Python", "Java");
    }

    public void displayQuestion(){
        for(Question q : questions){
            System.out.println(q);
        }
    }
}