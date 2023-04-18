package Models;

public enum Genero {
        ROCK("ROCK"), TRAP("TRAP"), JAZZ("JAZZ"),HIPHOP("HIPHOP"),POP("POP"),METAL("METAL"),CLASICA("METAL");

        private String name;

       private Genero (String name){
            this.name=name;
        }

    public String getName() {
        return this.name;
    }

}

