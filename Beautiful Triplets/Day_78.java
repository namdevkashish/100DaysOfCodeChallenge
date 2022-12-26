//100 Days of Code Challenge

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'beautifulTriplets' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static int beautifulTriplets(int d, List<Integer> arr) {
    // Write your code here
        int res = 0;   
        for (int i = 0; i < arr.size(); i++) {
            int x = arr.get(i);
            if (arr.contains(x + d) && arr.contains(x + 2 * d)) {
            res++;
           }
        }
        return res;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

/*
#TEST CASE 1:
Input (stdin)
7 3
1 2 4 5 7 8 10

Expected Output
3

#TEST CASE 2:
Input (stdin)
9988 17
1 3 4 5 10 11 12 14 15 17 21 22 24 25 27 30 31 33 35 43 44 45 48 49 51 52 53 56 59 61 63 64 66 67 70 72 73 75 78 79 80 81 82 86 91 95 97 99 100 102 103 105 107 108 111 113 115 116 117 118 119 121 122 123 124 125 127 128 129 132 135 138 139 140 143 146 147 148 151 152 155 157 159 160 162 164 165 173 176 177 178 179 182 190 193 194 197 199 200 202 206 210 211 214 220 221 222 223 224 225 228 234 238 239 241 242 244 245 247 249 251 256 257 259 260 261 264 266 268 270 271 274 276 280 284 285 286 288 291 299 300 301 302 303 306 307 309 312 314 315 316 317 319 320 321 323 324 325 327 329 330 331 332 333 336 339 341 342 344 345 346 347 348 349 351 352 353 354 355 356 357 359 363 364 365 366 371 374 376 377 379 380 384 385 387 388 389 390 392 394 398 399 400 404 405 407 409 410 411 416 417 419 424 425 426 427 428 430 431 433 434 435 436 437 439 440 441 445 446 449 450 452 453 456 457 464 465 468 469 471 472 473 475 479 486 487 492 493 494 495 496 497 499 503 504 506 507 508 510 512 513 515 516 518 519 520 521 {-truncated-}

Expected Output
2478

#TEST CASE 3:
Input (stdin)
2 2
2 4

Expected Output
0

*/
