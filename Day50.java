//42. Trapping Rain Water
class Solution {
    public int trap(int[] height) {
         int n=height.length;
        //calculate left max boundary--array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for (int i = 1; i < n ; i++) {
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        // calculate right max boundary--array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for (int i = n-2; i >=0 ; i--) {
            rightMax[i]=Math.max(height[i], rightMax[i+1]);

        }
        //loop
        int WaterTrapped=0;
        for (int i = 0; i < n; i++) {
            //waterLevel=min(left max,right max)
            int waterLevel=Math.min(leftMax[i], rightMax[i]);
            //trapped water=waterLevel - height[i]
            WaterTrapped= WaterTrapped+ (waterLevel-height[i]);
        }
        return WaterTrapped;

    }
        
    }
