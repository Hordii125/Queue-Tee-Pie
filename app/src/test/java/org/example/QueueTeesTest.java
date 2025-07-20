package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTeesTest {
    @Test
    public void testQueueTees() {
        QueueTees queueTees = new QueueTees(3);
        Shark shark = new Shark();
        Bear bear = new Bear();
        GoldenFish goldenFish = new GoldenFish();

        assertEquals(0, queueTees.size());
        assertEquals(3, queueTees.capacity());
        assertTrue(queueTees.isEmpty());
        assertFalse(queueTees.isFull());

        queueTees.enqueue(shark);
        queueTees.enqueue(bear);
        queueTees.enqueue(goldenFish);

        assertEquals(3, queueTees.size());
        assertFalse(queueTees.isEmpty());
        assertTrue(queueTees.isFull());

        assertEquals("Shark", queueTees.dequeue());
        assertEquals(2, queueTees.size());

        assertEquals("Bear", queueTees.dequeue());
        assertEquals(1, queueTees.size());

        assertEquals("GoldenFish", queueTees.dequeue());
        assertEquals(0, queueTees.size());

        assertTrue(queueTees.isEmpty());

        //attempt to dequeue from an empty queue
        assertNull(queueTees.dequeue());

        //attempt to enqueue when full
        queueTees.enqueue(shark);
        queueTees.enqueue(bear);
        queueTees.enqueue(goldenFish);

        assertEquals(3, queueTees.size());
        assertTrue(queueTees.isFull());

        //attempt to enqueue when full
        queueTees.enqueue(goldenFish); // This should print "Queue is full!"
        assertEquals(3, queueTees.size()); // Size should remain unchanged
        assertTrue(queueTees.isFull());
        assertFalse(queueTees.isEmpty());

        //dequeue all elements to empty the queue
        assertEquals("Shark", queueTees.dequeue());
        assertEquals(2, queueTees.size());
        assertEquals("Bear", queueTees.dequeue());
        assertEquals(1, queueTees.size());
        assertEquals("GoldenFish", queueTees.dequeue());
        assertEquals(0, queueTees.size());
        assertTrue(queueTees.isEmpty());

    }
}
