package Loops.Tasks.task2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Hospital {
    private final int maxPatientsNumber = 10;
    private Patient[] patients = new Patient[maxPatientsNumber];
    private int regPatients = 0;

    public void addPatient(Patient patient) {
       if(regPatients<maxPatientsNumber){
           patients[regPatients]=patient;
           regPatients++;
        }else{
           System.out.println("Zapisano maksymalną liczbę pacjentów, zapraszamy jutro!");
       }
    }
    public void printPatients(){
        for (int i=0; i<regPatients;i++){
            System.out.println(patients[i].getFirstName()+ " " + patients[i].getLastName()+ " "
            +patients[i].getPESEL());
        }
    }
}
