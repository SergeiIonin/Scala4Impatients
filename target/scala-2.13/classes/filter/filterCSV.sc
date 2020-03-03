val vector: Seq[String] = Vector("question1 , question1 body",
  "choice1 , choice1 body",
  "choice2 , choice2 body",
  "choice3 , choice3 body",
  "choice4 , choice4 body",
  "question2 , question2 body",
  "choice1 , choice1 body",
  "choice2 , choice2 body",
  "choice3 , choice3 body",
  "choice4 , choice4 body",
  "question3 , question3 body",
  "choice1 , choice1 body",
  "choice2 , choice2 body",
  "choice3 , choice3 body",
  "choice4 , choice4 body"
)

vector.filter(x => x != ", ")
