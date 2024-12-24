// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: solana-storage.proto

package solana.storage.ConfirmedBlock;

public interface InnerInstructionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:solana.storage.ConfirmedBlock.InnerInstruction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 program_id_index = 1;</code>
   * @return The programIdIndex.
   */
  int getProgramIdIndex();

  /**
   * <code>bytes accounts = 2;</code>
   * @return The accounts.
   */
  com.google.protobuf.ByteString getAccounts();

  /**
   * <code>bytes data = 3;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * Invocation stack height of an inner instruction.
   * Available since Solana v1.14.6
   * Set to `None` for txs executed on earlier versions.
   * </pre>
   *
   * <code>optional uint32 stack_height = 4;</code>
   * @return Whether the stackHeight field is set.
   */
  boolean hasStackHeight();
  /**
   * <pre>
   * Invocation stack height of an inner instruction.
   * Available since Solana v1.14.6
   * Set to `None` for txs executed on earlier versions.
   * </pre>
   *
   * <code>optional uint32 stack_height = 4;</code>
   * @return The stackHeight.
   */
  int getStackHeight();
}