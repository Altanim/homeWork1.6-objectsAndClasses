import java.util.Objects;

    public class Author {
        private String firstName;
        private String secondName;

        public Author(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getSecondName() {
            return this.secondName;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.firstName});
        }

        public String toString() {
            return this.firstName + " " + this.secondName;
        }

        public boolean equals(Object other) {
            if (this.getClass() != other.getClass()) {
                return false;
            } else {
                Author adamsDouglas = (Author)other;
                return this.firstName.equals(adamsDouglas.firstName);
            }
        }
    }




