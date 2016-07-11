/**
 * Created by Тарас on 11.07.2016.
 */
        //Завдання №2
import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, i1;
        i = scan.nextInt();
        i1 = i;
        int i3 = i1 % 2;
        if (i3 < 1) {
            System.out.println("число парне");
        } else {
            System.out.println("число непарне");
        }

        //Завдання №3
        double i4, i5, a1, b1, c1, d1;
        i4 = scan.nextDouble();
        i5 = scan.nextDouble();

        a1 = i4;
        b1 = i5;

        c1 = 10 - i4;
        d1 = i5 - 10;
        if (c1 < d1) {
            System.out.println(i4);
        } else {
            System.out.println(i5);
        }
        // /Завдання №4
        double q1, q2, q3, a2, b2, c2;
        q1 = scan.nextDouble();
        q2 = scan.nextDouble();
        q3 = scan.nextDouble();
        a2 = q1;
        b2 = q2;
        c2 = q3;
        if (a2 > b2) {
            if (a2 > c2) {
                System.out.println(q1);
            }
        } else {
            if (b2 > c2) {
                System.out.println(q2);
            } else {
                System.out.println(q3);
            }
        }
        //Завдання №5
        double w1, w2, w3, w4, a3, b3, c3, d3;
        w1 = scan.nextDouble();
        w2 = scan.nextDouble();
        w3 = scan.nextDouble();
        w4 = scan.nextDouble();
        a3 = w1;
        b3 = w2;
        c3 = w3;
        d3 = w3;
        if (a3 > b3) {
            if (a3 > c3) {
                if (a3 < d3) {
                    System.out.println(w1);
                } else {
                    if (a3 > b3) {
                        if (a3 < c3) {
                            if (a3 > d3) {
                                System.out.println(w1);
                            } else {
                                if (a3 < b3) {
                                    if (a3 > c3) {
                                        if (a3 > d3) {
                                            System.out.println(w1);
                                        } else {
                                            if (b3 > a3) {
                                                if (b3 > c3) {
                                                    if (b3 < d3) {
                                                        System.out.println(w2);
                                                    } else {
                                                        if (b3 > a3) {
                                                            if (b3 < c3) {
                                                                if (b3 > d3) {
                                                                    System.out.println(w2);
                                                                } else {
                                                                    if (b3 < a3) {
                                                                        if (b3 > c3) {
                                                                            if (b3 > d3) {
                                                                                System.out.println(w2);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (c3 > a3) {
                if (c3 > b3) {
                    if (c3 < d3) {
                        System.out.println(w3);
                    } else {
                        if (c3 > a3) {
                            if (c3 < b3) {
                                if (c3 > d3) {
                                    System.out.println(w3);
                                } else {
                                    if (c3 < a3) {
                                        if (c3 > b3) {
                                            if (c3 > d3) {
                                                System.out.println(w3);
                                            } else {
                                                if (d3 > a3) {
                                                    if (d3 > c3) {
                                                        if (d3 < b3) {
                                                            System.out.println(w4);
                                                        } else {
                                                            if (d3 > a3) {
                                                                if (d3 < c3) {
                                                                    if (d3 > b3) {
                                                                        System.out.println(w4);
                                                                    } else {
                                                                        if (d3 < a3) {
                                                                            if (d3 > c3) {
                                                                                if (d3 > b3) {
                                                                                    System.out.println(w4);

                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //Завдання 6
        double a6, b6, c6, d6, r, x1, x2;
        a6 = 6.45;
        b6 = 5.21;
        c6 = 3.33;
        d6 = (b6 * b6) - 4 * a6 * c6;
        r = Math.sqrt(d6);
        x1 = (-b6 - r) / 2 * a6;
        x2 = (-b6 + r) / 2 * a6;

        if(r > 0){
            System.out.println(x1);
            System.out.println(x2);
        }else {
            System.out.println("No");
        }

    }
}

