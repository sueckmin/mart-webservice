package com.moons.webservice.dto.test;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@NoArgsConstructor
public class TestDto {
    private Long no1;
    private Long no2;
    private Long no3;

    private int n1;
    private int n2;
    private int n3;

    private int tmp;
    private int sum;

    private Random r = new Random();

    @Builder
    public TestDto(Long no1, Long no2, Long no3){
        this.no1 = no1;
        this.no2 = no2;
        this.no3 = no3;

        this.n1 = (int)(1/no1 * 1000);
        this.n2 = (int)(1/no2 * 1000);
        this.n3 = (int)(1/no3 * 1000);

        System.out.println("n1"+n1+"n2"+n2+"n3"+n3);
        this.sum = this.n1 + this.n2 + this.n3;
        System.out.println(sum);
        this.tmp = this.sum - this.n3;
        System.out.println("tmp = sum - n3 --> tmp : "+tmp);
        this.n3 = this.tmp;
        this.tmp = this.n3 - this.n2;
        System.out.println("tmp = n3 - n2 --> tmp : "+tmp);
        this.n2 = this.tmp;
    }


    public String result(){
        tmp = r.nextInt(sum);
        if(tmp <= n1){
            return "no1";
        }
        else if(tmp <= n2){
            return "no2";
        }
        else{
            return "no3";
        }
    }

}
