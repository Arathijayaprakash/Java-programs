class Producer extends Thread{
void producer(){
synchronized(q){
//produce item to the queue
q.notify();
}
}
}
class Consumer extends Thread{
void consumer(){
synchronized(q){
if(q is empty){
q.wait();
}else{
consumer item;
}
}
}
} 