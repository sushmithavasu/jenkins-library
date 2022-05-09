def call(String username = 'null', String designation = 'a') { 
	
	echo "This is shared library greetUser"
	
	
	pipeline {
		environment { 
			USER_NAME = "${username}"
			DESIG = "${designation}"
		}	
		agent any 
		stages {
			stage('GREET') {
				steps {
					echo "Hi ${USER_NAME}, How are you !"
					echo "Your designation is ${DESIG}"
				}
			}
		}
	}
}
