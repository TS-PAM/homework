package com.ts.homework.week3.entity;

import java.io.IOException;
import java.util.ArrayList;

public interface ISeller {
    void viewActiveBuyers(ArrayList<Buyer> buyers) throws IOException;
}
