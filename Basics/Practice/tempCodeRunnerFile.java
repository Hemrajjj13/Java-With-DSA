System.out.println("If you know the Three Sides of triangle Enter 1 or If you know the base and height of the Triangle Enter 2");
        int num = in.nextInt();
        
        if(num == 1) {
            System.out.print("Enter base of traingle: ");
            int base = in.nextInt();
            System.out.print("Enter height of tringle: ");
            int height = in.nextInt();

            double AoT = 0;
            AoT = (base * height) / 2;
            System.out.println("Area of Trinagle is: "+ AoT); 
        }
        else if (num == 2){
            System.out.println("Enter three Sides of triangle: ");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            double s = (a + b + c) / 2;

            double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area of Trinagle is: "+ Area);
            
        }
        else {
            System.out.println("Invalid Input");
        }