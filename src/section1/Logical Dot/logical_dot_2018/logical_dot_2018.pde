void setup () { 
  size(1000, 1000);
} 
void draw() {
  fill(#FF5F15); 
  if (mousePressed) { 
    fill(#1580FF);
  }
  ellipse(500,500,1000,1000);
}