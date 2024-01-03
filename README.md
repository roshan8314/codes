 class SquareAndCube {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4};

        for (int num : numbers) {
            int square = num * num;
            int cube = num * num * num;
            System.out.println(square);
            System.out.println(cube);
        }
    }
}
