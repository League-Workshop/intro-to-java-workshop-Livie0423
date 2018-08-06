PImage ears;
PImage conure;
void setup(){ 
  conure = loadImage("conure.jpg");
size(800, 600);
conure.resize(width,height);
 ears = loadImage("bunny.png");
 ears.resize(208,131);
} 
void draw(){ 
background(conure);
image(ears, mouseX, mouseY);
}