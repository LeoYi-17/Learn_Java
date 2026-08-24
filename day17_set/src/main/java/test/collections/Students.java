package test.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Students implements Comparable<Students>{
    private String name;
    private Integer score;

    @Override
    public int compareTo(Students o) {
        return o.getScore() - this.getScore();
    }
}
