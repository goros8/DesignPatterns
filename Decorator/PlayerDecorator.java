package Decorator;

import java.util.ArrayList;

// PlayerDecorator class for combining the arraylists into one
public abstract class PlayerDecorator extends Player {
    public PlayerDecorator(Player player, String decorFile) {
        super(new ArrayList<>(player.getLines()), player.getName());
        integrateDecor(FileReader.getLines(decorFile));
    }

    protected void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }

    private void integrateDecor(ArrayList<String> decorLines) {
        // add ASCII art to newLines
        ArrayList<String> newLines = new ArrayList<>();

        // Ensure both lists have the same number of lines
        int numLines = Math.max(getLines().size(), decorLines.size());

        for (int i = 0; i < numLines; i++) {
            StringBuilder combinedLine = new StringBuilder();

            // combines the characters for each array list while
            // giving priority to decorChar over baseChar when decorChar is not a space
            for (int j = 0; j < Math.max(getLines().get(i).length(), decorLines.get(i).length()); j++) {
                char baseChar = (j < getLines().get(i).length()) ? getLines().get(i).charAt(j) : ' ';
                char decorChar = (j < decorLines.get(i).length()) ? decorLines.get(i).charAt(j) : ' ';

                if (decorChar != ' ') {
                    combinedLine.append(decorChar);
                } else {
                    combinedLine.append(baseChar);
                }
            }

            newLines.add(combinedLine.toString());
        }

        setLines(newLines);
    }
}
