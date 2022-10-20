package org.jsds.model;

import java.util.List;

/**
 * The current state of a game. A {@code GameState} provides information which allows an agent to
 * reason about a game and play it intelligently.
 */
public interface GameState {

  /**
   * Computes and returns what actions an agent can take from the current state.
   *
   * @param agentId agent to find moves for
   * @return list of possible actions for agentId
   */
  List<?> getLegalActions(int agentId);

  /**
   *
   * @return the current score of the game
   */
  int getScore();
}
