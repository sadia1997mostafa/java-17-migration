 {
<<<<<<< HEAD

=======
   "name": "Java Build",
>>>>>>> ini
   "on": {
     "push": {
       "branches": ["**"]
     },
     "pull_request": {
       "branches": ["main"]
     }
   },
   "jobs": {
     "build": {
       "runs-on": "ubuntu-latest",
       "steps": [
         {
           "name": "Checkout repository",
           "uses": "actions/checkout@v4"
         },
         {
           "name": "Set up JDK",
           "uses": "actions/setup-java@v4",
           "with": {
             "distribution": "temurin",
             "java-version": "17"
           }
         },
         {
           "name": "Compile Java",
           "run": "javac *.java"
         }
       ]
     }
   }
}
// dfhjrf,ehggejyerhy
