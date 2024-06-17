package com.nisha.quizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"



    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val ques1 = Question(
            id = 1,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_argentina,
            optionOne = "Argentina", "Australia", "India", "Armenia",
            correctAnswer = 1
        )
        questionsList.add(ques1)

        val ques2 = Question(
            id = 2,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_india,
            optionOne = "Argentina", "Australia", "India", "Armenia",
            correctAnswer = 3
        )
        questionsList.add(ques2)

        val ques3 = Question(
            id = 3,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_australia,
            optionOne = "Argentina", "Australia", "India", "Armenia",
            correctAnswer = 2
        )
        questionsList.add(ques3)

        val ques4 = Question(
            id = 4,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_belgium,
            optionOne = "Belgium", "Australia", "India", "Armenia",
            correctAnswer = 1
        )
        questionsList.add(ques4)

        val ques5 = Question(
            id = 5,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_brazil,
            optionOne = "Argentina", "Australia", "Brazil", "Armenia",
            correctAnswer = 3
        )
        questionsList.add(ques5)

        val ques6 = Question(
            id = 6,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_denmark,
            optionOne = "Argentina", "DenMark", "India", "Armenia",
            correctAnswer = 2
        )
        questionsList.add(ques6)

        val ques7 = Question(
            id = 7,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_fiji,
            optionOne = "Argentina", "Australia", "India", "Fiji",
            correctAnswer = 4
        )
        questionsList.add(ques7)

        val ques8 = Question(
            id = 8,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_germany,
            optionOne = "Argentina", "Australia", "Germany", "Armenia",
            correctAnswer = 3
        )
        questionsList.add(ques8)

        val ques9 = Question(
            id = 9,
            question = "What country does this flag belong to?",
            image = R.drawable.ic_flag_of_kuwait,
            optionOne = "Kuwait", "Australia", "India", "Armenia",
            correctAnswer = 1
        )
        questionsList.add(ques9)
        return questionsList
    }
}