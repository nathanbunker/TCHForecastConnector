package org.tch.fc.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TestEvent implements Serializable
{

  public TestEvent() {
    // default;
  }

  public TestEvent(int eventId, Date eventDate) {
    this.event = Event.getEvent(eventId);
    this.eventDate = eventDate;
  }

  public TestEvent(TestEvent testEventParent, TestCase testCase) {
    setEvent(testEventParent.getEvent());
    setEventDate(testEventParent.getEventDate());
    setTestCase(testCase);
  }

  private static final long serialVersionUID = 1L;

  private int testEventId = 0;
  private TestCase testCase = null;
  private Event event = null;
  private Date eventDate = null;
  private List<EvaluationActual> evaluationActualList = null;
  private Condition condition = null;

  public Condition getCondition() {
    return condition;
  }

  public void setCondition(Condition condition) {
    this.condition = condition;
  }

  public String getConditionCode() {
    return condition == null ? null : condition.getConditionCode();
  }

  public void setConditionCode(String conditionCode) {
    condition = Condition.getCondition(conditionCode);
  }

  public List<EvaluationActual> getEvaluationActualList() {
    return evaluationActualList;
  }

  public void setEvaluationActualList(List<EvaluationActual> evaluationActualList) {
    this.evaluationActualList = evaluationActualList;
  }

  public int getTestEventId() {
    return testEventId;
  }

  public void setTestEventId(int testEventId) {
    this.testEventId = testEventId;
  }

  public TestCase getTestCase() {
    return testCase;
  }

  public void setTestCase(TestCase testCase) {
    this.testCase = testCase;
  }

  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  public Date getEventDate() {
    return eventDate;
  }

  public void setEventDate(Date eventDate) {
    this.eventDate = eventDate;
  }
}