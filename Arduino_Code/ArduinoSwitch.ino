const int dato1 = 2;
const int dato2 = 3;
const int dato3 = 4;
int inByte1  = 0;
void setup(){
    Serial.begin(9600); //Open the serial port
    pinMode(dato1, OUTPUT);
    pinMode(dato2, OUTPUT);
    pinMode(dato3, OUTPUT);
    digitalWrite(dato1, LOW);
    digitalWrite(dato2, LOW);
    digitalWrite(dato3, LOW);
  }
void loop(){
    if(Serial.available() > 0){
        inByte1 = Serial.read();
        Serial.println(inByte1);
        con1();
        con2();
        con3();
           
         }
  
   }
void con1(){
  if(inByte1 == '0')
            digitalWrite(dato1, LOW);
        else if(inByte1=='1'){ //Se ingresa la señal y se da tiempode encendido
            digitalWrite(dato1, HIGH);
            delay(2000);
            digitalWrite(dato1, LOW);
        }else if(inByte1=='2'){
            digitalWrite(dato1, HIGH);
            delay(4000);
            digitalWrite(dato1, LOW);
        }else if(inByte1=='3'){
            digitalWrite(dato1, HIGH);
            delay(6000);
            digitalWrite(dato1, LOW);
        }else if(inByte1=='4'){
            digitalWrite(dato1, HIGH);
            delay(8000);
            digitalWrite(dato1, LOW);
        }else{}
  }
  void con2(){
    if(inByte1 == '0')
            digitalWrite(dato2, LOW);
        else if(inByte1=='5'){ //Se ingresa la señal y se da tiempode encendido
            digitalWrite(dato2, HIGH);
            delay(2000);
            digitalWrite(dato2, LOW);
        }else if(inByte1=='6'){
            digitalWrite(dato2, HIGH);
            delay(4000);
            digitalWrite(dato2, LOW);
        }else if(inByte1=='7'){
            digitalWrite(dato2, HIGH);
            delay(6000);
            digitalWrite(dato2, LOW);
        }else if(inByte1=='8'){
            digitalWrite(dato2, HIGH);
            delay(8000);
            digitalWrite(dato2, LOW);
        }   
    }
    void con3(){
          if(inByte1 == '0')
            digitalWrite(dato3, LOW);
        else if(inByte1 =='9'){ //Se ingresa la señal y se da tiempode encendido
            digitalWrite(dato3, HIGH);
            delay(2000);
            digitalWrite(dato3, LOW);
        }
        String led = String(inByte1);
          if(led.compareTo("0"))
          digitalWrite(dato3,LOW);
           if(led.compareTo("10")){
            digitalWrite(dato3, HIGH);
            delay(4000);
            digitalWrite(dato3, LOW);
        }else if(led.compareTo("11")){
            digitalWrite(dato3, HIGH);
            delay(6000);
            digitalWrite(dato3, LOW);
        }else if(led.compareTo("12")){
            digitalWrite(dato3, HIGH);
            delay(8000);
            digitalWrite(dato3, LOW);
        }
        }
          

    
