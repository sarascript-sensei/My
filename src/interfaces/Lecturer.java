package interfaces;

public class Lecturer implements Person{
        private String name;
        private String mail;
        private String subject;

        public Lecturer (String name, String mail, String subject) {
            this.name = name;
            this.mail = mail;
            this.subject = subject;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getMail() {
            return mail;
        }

        @Override
        public String getGrade(){
            return null;
        }


        @Override
        public void getDescription() {
            System.out.println(name + " -Преподает " + subject );
        }

        @Override
        public String getSubject() {

            return subject;
        }

        @Override
        public String getDepartment() {
            return null;
        }

    }
