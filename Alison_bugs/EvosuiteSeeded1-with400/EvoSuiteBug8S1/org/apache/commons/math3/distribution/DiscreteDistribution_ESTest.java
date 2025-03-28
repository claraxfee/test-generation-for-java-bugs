/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 26 02:24:45 GMT 2025
 */

package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Short short0 = new Short((short)3146);
      Double double0 = new Double((short)3146);
      Pair<Short, Double> pair0 = new Pair<Short, Double>(short0, double0);
      List<Pair<Short, Double>> list0 = List.of(pair0, pair0, pair0, pair0, pair0, pair0);
      DiscreteDistribution<Short> discreteDistribution0 = new DiscreteDistribution<Short>(list0);
      discreteDistribution0.reseedRandomGenerator((short)3146);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-746));
      Double double0 = new Double((-746));
      Pair<Integer, Double> pair0 = new Pair<Integer, Double>(integer0, double0);
      List<Pair<Integer, Double>> list0 = List.of(pair0, pair0);
      DiscreteDistribution<Integer> discreteDistribution0 = null;
      try {
        discreteDistribution0 = new DiscreteDistribution<Integer>(list0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -746 is smaller than the minimum (0)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Double double0 = new Double(681.35188);
      Pair<Float, Double> pair0 = new Pair<Float, Double>((Float) null, double0);
      List<Pair<Float, Double>> list0 = List.of(pair0, pair0, pair0, pair0, pair0, pair0, pair0, pair0, pair0, pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>(list0);
      Float float0 = new Float((float) 1L);
      double double1 = discreteDistribution0.probability(float0);
      assertEquals(0.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Double double0 = new Double(681.35188);
      Pair<Float, Double> pair0 = new Pair<Float, Double>((Float) null, double0);
      Float float0 = new Float((-2181.2356F));
      Pair<Float, Double> pair1 = new Pair<Float, Double>(float0, double0);
      List<Pair<Float, Double>> list0 = List.of(pair0, pair1, pair0, pair1, pair1, pair0, pair1, pair0, pair0, pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>(list0);
      double double1 = discreteDistribution0.probability((Float) null);
      assertEquals(0.6, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Pair<Byte, Double>[] pairArray0 = (Pair<Byte, Double>[]) Array.newInstance(Pair.class, 5);
      Byte byte0 = new Byte((byte)80);
      Double double0 = new Double((byte)80);
      Pair<Byte, Double> pair0 = new Pair<Byte, Double>(byte0, double0);
      pairArray0[0] = pair0;
      pairArray0[1] = pair0;
      pairArray0[2] = pair0;
      pairArray0[3] = pair0;
      pairArray0[4] = pair0;
      List<Pair<Byte, Double>> list0 = List.of(pairArray0);
      DiscreteDistribution<Byte> discreteDistribution0 = new DiscreteDistribution<Byte>((RandomGenerator) null, list0);
      double double1 = discreteDistribution0.probability(byte0);
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Short short0 = new Short((short)3146);
      Double double0 = new Double((short)3146);
      Pair<Short, Double> pair0 = new Pair<Short, Double>(short0, double0);
      List<Pair<Short, Double>> list0 = List.of(pair0, pair0, pair0, pair0, pair0, pair0);
      DiscreteDistribution<Short> discreteDistribution0 = new DiscreteDistribution<Short>(list0);
      List<Pair<Short, Double>> list1 = discreteDistribution0.getSamples();
      assertEquals(6, list1.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Double double0 = new Double(681.35188);
      Pair<Float, Double> pair0 = new Pair<Float, Double>((Float) null, double0);
      List<Pair<Float, Double>> list0 = List.of(pair0, pair0, pair0, pair0, pair0, pair0, pair0, pair0, pair0, pair0);
      DiscreteDistribution<Float> discreteDistribution0 = new DiscreteDistribution<Float>(list0);
      Float float0 = discreteDistribution0.sample();
      assertNull(float0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a();
      Short short0 = new Short((short)487);
      Double double0 = new Double((short)487);
      Pair<Short, Double> pair0 = new Pair<Short, Double>(short0, double0);
      List<Pair<Short, Double>> list0 = List.of(pair0, pair0, pair0, pair0, pair0, pair0);
      DiscreteDistribution<Short> discreteDistribution0 = new DiscreteDistribution<Short>(well44497a0, list0);
      Short[] shortArray0 = discreteDistribution0.sample((int) (short)487);
      assertEquals(487, shortArray0.length);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Well44497a well44497a0 = new Well44497a();
      Short short0 = new Short((short)3162);
      Double double0 = new Double((short)3162);
      Pair<Short, Double> pair0 = new Pair<Short, Double>(short0, double0);
      List<Pair<Short, Double>> list0 = List.of(pair0, pair0, pair0, pair0, pair0, pair0);
      DiscreteDistribution<Short> discreteDistribution0 = new DiscreteDistribution<Short>(well44497a0, list0);
      try { 
        discreteDistribution0.sample((-1915));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // number of samples (-1,915)
         //
         verifyException("org.apache.commons.math3.distribution.DiscreteDistribution", e);
      }
  }
}
