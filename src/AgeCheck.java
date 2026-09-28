/* Find fejlen i koden og ret den */

void main() {
    int age = Integer.parseInt(IO.readln("Indtast din alder: "));

    if (isAdult(age)) {
        IO.println("Du er voksen.");
    } else {
        IO.println("Du er ikke voksen.");
    }
}

boolean isAdult(int age) {
    return age >= 18;
//Changed java version
}