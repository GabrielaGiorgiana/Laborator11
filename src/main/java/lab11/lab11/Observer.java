package lab11.lab11;


interface Observer {
    void update(String message);
}


interface Subject {
    void attach(Observer o);
    void detach(Observer o);
    void notifyObservers(String message);
}