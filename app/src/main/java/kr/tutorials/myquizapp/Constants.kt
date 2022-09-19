package kr.tutorials.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "어디에서 찍은 사진일까요?",
            R.drawable.ques1,
            "통영","대구","제주","인천",4
        )
        questionList.add(que1)

        val que2 = Question(
            2, "어디에서 찍은 사진일까요?",
            R.drawable.ques2,
            "밀양","경주","태국","부산",2
        )
        questionList.add(que2)

        val que3 = Question(
            3, "어디에서 찍은 사진일까요?",
            R.drawable.ques3,
            "밀양","경주","인천","제주",1
        )
        questionList.add(que3)

        val que4 = Question(
            4, "어디에서 찍은 사진일까요?",
            R.drawable.ques4,
            "제주","서울","태국","부산",3
        )
        questionList.add(que4)

        val que5 = Question(
            5, "어디에서 찍은 사진일까요?",
            R.drawable.ques5,
            "강릉","인천","제주","경주",4
        )
        questionList.add(que5)

        val que6 = Question(
            6, "어디에서 찍은 사진일까요?",
            R.drawable.ques6,
            "서울","속초","통영","제주",1
        )
        questionList.add(que6)

        val que7 = Question(
            7, "어디에서 찍은 사진일까요?",
            R.drawable.ques7,
            "제주","태국","경주","인천",2
        )
        questionList.add(que7)

        val que8 = Question(
            8, "어디에서 찍은 사진일까요?",
            R.drawable.ques8,
            "통영","대구","제주","인천",3
        )
        questionList.add(que8)

        val que9 = Question(
            9, "어디에서 찍은 사진일까요?",
            R.drawable.ques9,
            "부산","인천","서울","강릉",3
        )
        questionList.add(que9)

        val que10 = Question(
            10, "어디에서 찍은 사진일까요?",
            R.drawable.ques10,
            "통영","대구","제주","인천",4
        )
        questionList.add(que10)



        return questionList


    }
}