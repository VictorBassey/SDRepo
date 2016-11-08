// set pin numbers:
const int buttonPin = PUSH2;
const int ledPin =  RED_LED;      

// Variables will change:
int buttonState;
int lastButtonState = LOW;

long lastDebounceTime = 0;
long debounceDelay = 50;

void setup() 
{
  pinMode(buttonPin, INPUT_PULLUP);
  pinMode(ledPin, OUTPUT);
  Serial.begin(9600);
}

void loop() 
{
  // read the state of the button:
  int sensorVal = digitalRead(buttonPin);

  if (sensorVal != lastButtonState)
  {
    lastDebounceTime = millis();
  } 
  
  if ((millis( ) - lastDebounceTime) > debounceDelay)
  {
    buttonState = sensorVal;
  } 

  // set the LED using the state of the button:
  if(buttonState == HIGH)
  {
    digitalWrite(ledPin, LOW);
  }
  else if(buttonState == LOW)
  {
    digitalWrite(ledPin, HIGH);
    double value = 12.25;
    String valueCV = String(12.25,0); // can only bring one digit of precision, any more
    // and problems start
    Serial.print(yesCV);
    delay(2000);
  }
  
  lastButtonState = sensorVal;
  
}
