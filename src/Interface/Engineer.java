package Interface;

public interface Engineer {
    void military();

    String GPA(double degree);

    void criminalDocument();

    void experience(String[] array);
}
    class computerEngineer implements Engineer {
        private boolean soldier;
        private boolean JusticeCriminal;

        public computerEngineer(boolean soldier, boolean justiceCriminal) {
            this.soldier = soldier;
            JusticeCriminal = justiceCriminal;
        }

        @Override
        public void military() {
if(soldier) {
    System.out.println("I had been a soldier");
}
    else{
        System.out.println("I had not finished military service");
    }

}


        @Override
        public String GPA(double degree) {

            return "My gpa "+degree;
        }

        @Override
        public void criminalDocument() {
if(JusticeCriminal){
    System.out.println("Justice document exists");
}
else{
    System.out.println("There is no justice document");
}
        }

        @Override
        public void experience(String[] array) {
            System.out.println("as computer engineer, I have worked at...");
            for(int i = 0; i<array.length; i++){
                System.out.println(array[i]);
            }
        }
    }
    class MechanicEngineer implements Engineer {
        private boolean soldier;
        private boolean JusticeCriminal;

        public MechanicEngineer(boolean soldier, boolean justiceCriminal) {
            this.soldier = soldier;
            JusticeCriminal = justiceCriminal;
        }

        @Override
        public void military() {

            if (soldier) {
                System.out.println("I had been a soldier");
            } else {
                System.out.println("I had not finished military service");
            }
        }

        @Override
        public String GPA(double degree) {
            return "My gpa " + degree;
        }

        @Override
        public void criminalDocument() {
            if (JusticeCriminal) {
                System.out.println("Justice document exists");
            } else {
                System.out.println("There is no justice document");
            }
        }

        @Override
        public void experience(String[] array) {
            if (array.length == 0) {
                System.out.println("I do not have any experience in the business");
            } else {
                System.out.println("I have work with...");
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            }
        }

        public void Reference(String[] array) {
            if (array.length == 0) {
                System.out.println("I do not have any reference");
            } else {
                System.out.println("My references...");
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
            }
        }
    }

        class Test {
            public static void main(String[] args) {
                //Engineer newengineer= new Engineer();--->error
                computerEngineer me = new computerEngineer(false, false);
                me.military();
                me.criminalDocument();
                System.out.println(me.GPA(3.07));
                String[] experience = {"Walmart", "Publix", "Lockit Martin"};
                me.experience(experience);
                //MechanicEngineer you = new MechanicEngineer(true, false);
                MechanicEngineer you = new MechanicEngineer(true, false);
                String[] experience2= {};
                String[] reference= {"John", "Jack"};
                you.criminalDocument();
                you.military();
                System.out.println(you.GPA(2.31));
                you.Reference(reference);


            }
        }

