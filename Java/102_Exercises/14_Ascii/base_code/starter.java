/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Welcome to the ASCII Museum!");
		System.out.println("Pleace choose an exhibbit:");
		System.out.println("1. Bombs");
		System.out.println("2.");
		System.out.println("3.");
		Scanner sc = new Scanner(System.in);
		String exhibit = sc.nextLine();
		if (exhibit.equals("Bombs")) {
			System.out.println("1.Black hole");
			System.out.println("2.Mushroom");
			System.out.println("3.Tower");
			String piece = sc.nextLine();
			if (piece.equals("Black Hole")) {

				System.out.println("                             ____");
				System.out.println("                     __,-~~/~    `---.");
				System.out.println("                   _/_,---(      ,    )");
				System.out.println("               __ /        <    /   )  \\___");
				System.out.println("- ------===;;;'====------------------===;;;===----- -  -");
				System.out.println("                  \\/  ~\"~\"~\"~\"~\"~\\~\"~)~\"/");
				System.out.println("                  (_ (   \\  (     >    \\)");
				System.out.println("                   \\_( _ <         >_>'");
				System.out.println("                      ~ `-i' ::>|--\"");
				System.out.println("                          I;|.|.|");
				System.out.println("                         <|i::|i|`.");
				System.out.println("                        (` ^'\"`-' \")");

			} else if (piece.equals("Mushroom")) {

				System.out.println("                               ________________");
				System.out.println("                          ____/ (  (    )   )  \\___");
				System.out.println("                         /( (  (  )   _    ))  )   )\\");
				System.out.println("                       ((     (   )(    )  )   (   )  )");
				System.out.println("                     ((/  ( _(   )   (   _) ) (  () )  )");
				System.out.println("                    ( (  ( (_)   ((    (   )  .((_ ) .  )_");
				System.out.println("                   ( (  )    (      (  )    )   ) . ) (   )");
				System.out.println("                  (  (   (  (   ) (  _  ( _) ).  ) . ) ) ( )");
				System.out.println("                  ( (  (   ) (  )   (  ))     ) _)(   )  )  )");
				System.out.println("                 ( (  ( \\ ) (    (_  ( ) ( )  )   ) )  )) ( )");
				System.out.println("                  (  (   (  (   (_ ( ) ( _    )  ) (  )  )   )");
				System.out.println("                 ( (  ( (  (  )     (_  )  ) )  _)   ) _( ( )");
				System.out.println("                  ((  (   )(    (     _    )   _) _(_ (  (_ )");
				System.out.println("                   (_((__(_(__(( ( ( |  ) ) ) )_))__))_)___)");
				System.out.println("                   ((__)        \\\\||lll|l||///          \\_))");
				System.out.println("                            (   /(/ (  )  ) )\\   )");
				System.out.println("                          (    ( ( ( | | ) ) )\\   )");
				System.out.println("                           (   /(| / ( )) ) ) )) )");
				System.out.println("                         (     ( ((((_(|)_)))))     )");
				System.out.println("                          (      ||\\(|(|)|/||     )");
				System.out.println("                        (        |(||(||)||||        )");
				System.out.println("                          (     //|/l|||)|\\\\ \\     )");
				System.out.println("                        (/ / //  /|//||||\\\\  \\ \\  \\ _)");
				System.out.println("-------------------------------------------------------------------------------");

			} else if (piece.equals("Tower")) {

				System.out.println("      )");
				System.out.println("     (");
				System.out.println("    .-`-.");
				System.out.println("    :   :");
				System.out.println("    :TNT:");
				System.out.println("    :___:");
				System.out.println("    \\|/");
				System.out.println("   - o -");
				System.out.println("    /-`-.");
				System.out.println("    :   :");
				System.out.println("    :TNT:");
				System.out.println("    :___:");
				System.out.println("    .---.");
				System.out.println("    : | :");
				System.out.println("    :-o-:");
				System.out.println("    :_|_:");

			}

		}

		sc.close();
	}
}
