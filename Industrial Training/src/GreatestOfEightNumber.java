public class GreatestOfEightNumber {
    public static void main(String[] args) {
        int a1=10,a2=1,a3=5,a4=20,a5=40,a6=70,a7=12,a8=130;
        if(a1>a2){
            if(a1>a3){
                if(a1>a4){
                    if(a1>a5){
                        if(a1>a6){
                            if(a1>a7){
                                if(a1>a8){
                                    System.out.println("a1 is greater.");
                                }else{
                                    System.out.println("a8 is greater");
                                }
                            }
                        }
                    }
                }
            }
        }if(a2>a3){
            if(a2>a4){
                if(a2>a5){
                    if(a2>a6){
                        if(a2>a7){
                            if(a2>a8){
                                System.out.println("a2 is greater");
                            }
                        }
                    }
                }
            }
        } if(a3>a4){
            if(a3>a5){
                if(a3>a6){
                    if(a3>a7){
                        if(a3>a8){
                            System.out.println("a3 is greater");
                        }
                    }
                }
            }
        }if(a4>a5){
            if(a4>a6){
                if(a4>a7){
                    if(a4>a8){
                        System.out.println("a4 is greater");
                    }
                }
            }
        }if(a5>a6){
            if(a5>a7){
                if(a5>a8){
                    System.out.println("a5 is greater");
                }
            }
        }if(a6>a7){
            if(a6>a8){
                System.out.println("a6 is greater");
            }
        }if(a7>a8){
            System.out.println("a7 is greater");
        }else{
            System.out.println("a8 is greater");
        }
    }
}
