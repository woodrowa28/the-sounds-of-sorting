# CSC 207: The Sounds of Sorting

Author: Aubrey Woodrow

## Revisions
- Fixed Maven checkstyle errors

## Resources

+ Code constructed with JDK23 using Apache NetBeans 24
+ TTAP: Data Structures—Lab Manual by Peter-Michael Osera
    https://osera.cs.grinnell.edu/ttap/data-structures-labs/text-editor.html
    - Provided instructions for project
+ Sorts.java file from the SortsLab by Aubrey Woodrow and Lauren Ajax
    https://github.com/LaurenAjax/sortslab (Forked from psosera)
    - Copied (and edited) quickSort code, referenced for mergeSort help
+ Wikipedia article for Gnome sort https://en.wikipedia.org/wiki/Gnome_sort
    - Used description and pseudocode for implementation help
+ Java 8 Function Interface API 
    https://docs.oracle.com/javase/8/docs/api/?java/util/function/package-summary.html
    - Provided information for changing Consumer parameters in the tests to
    Functions so they could produce the SortEvent list output
Java 8 JPanel, Graphics, and Color API 
https://docs.oracle.com/javase/8/docs/api/javax/swing/JPanel.html
https://docs.oracle.com/javase/8/docs/api/java/awt/Graphics.html
https://docs.oracle.com/javase/8/docs/api/java/awt/Color.html
    - Referenced to get information about ArrayPanel inhertied methods
+ BlockyGame.java file from the blocky project by Aubrey Woodrow
    https://github.com/woodrowa28/blocky (forked from psosera)
    - Used shuffle method for Fisher-Yates shuffle base
+ Consulted PM Osera for minor clarifications
    - Specific usage of CompareEvent in mergeSort

## Git log:

commit cb4b0a173d17540f071d8f789b96309f3b4b9f9d (HEAD -> main, origin/main)
Author: Aubrey Woodrow <woodrowa@grinnell.edu>
Date:   Sun Apr 20 14:32:55 2025 -0500

    Fixed checkstyle errors

commit 1c5cec908b5305cd6f2f8ae610657f745ef5a526 (HEAD -> main)
Author: Aubrey Woodrow <woodrowa@grinnell.edu>
Date:   Fri Mar 28 18:58:58 2025 -0500

    Completed panels, both visual and practical implementation

commit 5303cacb2fb10e271f3329462286c5ed6a52e399
Author: Aubrey Woodrow <woodrowa@grinnell.edu>
Date:   Thu Mar 27 21:32:04 2025 -0500

    Filled in NoteIndices method stubs

commit d0d802b91155a1737c5e00302600ecffa4559319 (origin/main)
Author: Aubrey Woodrow <woodrowa@grinnell.edu>
Date:   Wed Mar 26 18:22:35 2025 -0500

    Corrected eventSort naming convention

commit bff8448087108ac31f9e92ca641e16fa592eca90
Author: Aubrey Woodrow <woodrowa@grinnell.edu>
Date:   Wed Mar 26 17:47:52 2025 -0500

    Included SortEvent checking in tests

commit 7c49e91d8ba5678d5c222da556226477ba02b247
Author: Aubrey Woodrow <woodrowa@grinnell.edu>
Date:   Wed Mar 26 15:44:58 2025 -0500

    Updated sorts to produce SortEvent lists

commit 7f11b0f2af9695da4ca85c10da01f77fa17ca106
Author: Aubrey Woodrow <woodrowa@grinnell.edu>
Date:   Wed Mar 26 18:03:22 2025 -0500

    Resolving git rebase issues
                                                                                                                                                                                          
commit 2ea6dbc46404614c47324fe091f8b9f29042716d                                                                                                                                           
Author: Aubrey Woodrow <woodrowa@grinnell.edu>                                                                                                                                            
Date:   Tue Mar 25 23:47:31 2025 -0500                                                                                                                                                    
                                                                                                                                                                                          
    Implemented all SortEvent classes                                                                                                                                                     
                                                                                                                                                                                          
commit 287772d5f27815966718ae57adc7abeb481869fb                                                                                                                                           
Author: Aubrey Woodrow <woodrowa@grinnell.edu>                                                                                                                                            
Date:   Tue Mar 25 23:33:17 2025 -0500                                                                                                                                                    
                                                                                                                                                                                          
    Fixed merge and quick sorts, wrote tests                                                                                                                                              
                                                                                                                                                                                          
commit fe2be2792d9e2c326b832c4e9d8532dd1962d225                                                                                                                                           
Author: Aubrey Woodrow <woodrowa@grinnell.edu>                                                                                                                                            
Date:   Tue Mar 25 12:02:57 2025 -0500                                                                                                                                                    
                                                                                                                                                                                          
    Implemented base code for sorting algorithms                                                                                                                                          
                                                                                                                                                                                          
commit d1877511f2852805c2fdc34abc43ee12c0451bf0                                                                                                                                           
Author: Aubrey Woodrow <woodrowa@grinnell.edu>                                                                                                                                            
Date:   Thu Mar 20 16:45:16 2025 -0500                                                                                                                                                    
                                                                                                                                                                                          
    Reorganized file structure into proper sub-packages                                                                                                                                   
                                                                                                                                                                                          
commit 6052809646c1d33b3a4fff1820edd2c971af8aef                                                                                                                                           
Author: Peter-Michael Osera <osera@cs.grinnell.edu>                                                                                                                                       
Date:   Wed Mar 5 22:23:06 2025 -0600                                                                                                                                                     
                                                                                                                                                                                          
    project files                                                                                                                                                                         
                                                                                                                                                                                          
commit 6a087bbbe76723f35185fd1d5e82b797624a5c11                                                                                                                                           
Author: Peter-Michael Osera <osera@cs.grinnell.edu>                                                                                                                                       
Date:   Wed Mar 5 22:22:57 2025 -0600                                                                                                                                                     
                                                                                                                                                                                          
    initial commit     