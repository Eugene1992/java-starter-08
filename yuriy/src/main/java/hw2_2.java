/**
 * Created by shast on 7/11/2016.
 */
/**
 * Created by shast on 7/11/2016.
 */
import java.util.Scanner;
public class hw2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
    }
}
















