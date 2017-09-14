# Etyl Paparazzi
Simple tool to take screenshots of Etyl Applications

## Maven
```
<dependency>
    <groupId>com.harium.etyl</groupId>
    <artifactId>paparazzi</artifactId>
    <version>1.0.1</version>
</dependency>
```

## Example
Call this in an Application and Paparazzi takes the screenshot for you.

```
BufferedImage image = Paparazzi.takeScreenShot(this);
```

You can save the image with this code:
```
File output = new File(PathHelper.currentDirectory() + "output.jpg");
try {
    ImageIO.write(image, "jpg", output);
} catch (IOException e) {
    e.printStackTrace();
}
```