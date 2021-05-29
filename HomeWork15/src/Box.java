public class Box {
    double width;
    double height;
    double length;

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double size) {
        width = size;
        height = size;
        length = size;

    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.height = box1.height + box2.height;
        this.length = box1.length + box2.length;
    }

    Box boxing(Box box) {
        return new Box(width + box.width, height + box.height, length + box.length);
    }

    Box increase(int i) {
        return new Box(width * i, height * i, length * i);
    }


    double volume() {
        return width * height * length;
    }

    void showVolume() {
        System.out.println(volume());
    }

    int compare(Box box) {
        double thisVolume = volume();
        double boxvolume = box.volume();
        int result;
        if (thisVolume > boxvolume) {
            result = 1;
        } else if (thisVolume < boxvolume) {
            result = -1;
        } else
            result = 0;
        return result;
    }

}
