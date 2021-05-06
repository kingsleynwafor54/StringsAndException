package StringPractices;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Random;
public class RandomSentenceGenerator {



        public static void main(String[] args) {
            SecureRandom random = new SecureRandom();


            String[] article = {"Good hygiene", "Jesus Loves you ", "Seyi the Pastor ", "John the mecko ", "Mathew the preacher ", "James the fighter ", "peter the fisher man "};
            String[] noun = {"Mathew ", "James ", "peter ", "katie ", " Job ", "Jennifer ", "Paul ", "Matt ",};
            String[] verbs = {"Job ", "Jennifer ", "Paul ", "Matt ", "kings ", "Yemi ", "segun", "pete "};
            String[] preposition = {"kings ", "Yemi ", "segun ", "pete ", "Job ", "Jennifer ", "Paul ", "Matt "};
            String sent=" ";
            String sent1="" ;
            for(int counter=0;counter<19;counter++){
                int random1=random.nextInt(6);
                int random2=1+random.nextInt(6);
             sent=   article[random1].concat(noun[random1].concat(verbs[random1].concat(preposition[random1])));
             sent1=   article[random2].concat(noun[random2].concat(verbs[random2].concat(preposition[random2])));
                System.out.println(sent);
            }
            System.out.println(sent1.toUpperCase());
        }
    }
